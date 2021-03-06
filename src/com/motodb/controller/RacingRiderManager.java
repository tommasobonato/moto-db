package com.motodb.controller;

import java.sql.Date;

import com.motodb.model.RacingRider;
import com.motodb.model.RacingRiderView;
import com.motodb.model.Team;
import com.motodb.model.Tyre;

import javafx.collections.ObservableList;

public interface RacingRiderManager {
    /**
     * 
     * @param year
     * @param weekendDate
     * @param className
     * @param sessionCode
     * @param fastestTime
     * @param position
     * @param averageSpeed
     * @param finished
     * @param personalCode
     * @param manufacturer
     * @param bikeModel
     * @param points
     */
    public void addRacingRider(int year, Date weekendDate, String className, String sessionCode, String fastestTime,
            int position, Boolean finished, Integer personalCode, String manufacturer, String bikeModel,
            String teamName, int points, ObservableList<Tyre> tyres);

    /**
     * 
     * @return
     */
    public ObservableList<RacingRider> getRacingRiders();

    /**
     * @deprecated Now team is a field of racingRider. A simpler method should
     *             be done.
     */
    public Team getTeamByRiderAndYear(int rider, int year);

    public ObservableList<RacingRider> getRidersFromYearWeekSess(int year, Date weekend, String session);

    String getRiderNameByCode(int code);

    ObservableList<RacingRiderView> getRacingRidersForView();

    ObservableList<RacingRider> getRidersFromYearWeekSessClass(int year, Date weekend, String session, String clax);

    public ObservableList<RacingRiderView> getRidersFromYearWeekSessClassForView(int parseInt, Date valueOf,
            String string, String string2);
}
