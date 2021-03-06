package com.motodb.controller;

import com.motodb.model.Contract;
import com.motodb.view.AddContractControl.MemberType;

import javafx.collections.ObservableList;

public interface ContractManager {
    /**
     * 
     * @return
     */
    public ObservableList<Contract> getContracts();

    /**
     * 
     * @param year
     * @param memberType
     * @param member
     * @param team
     */
    public void addContract(Integer year, MemberType memberType, Integer member, String team);

    /**
     * 
     * @param year
     * @param memberType
     * @param member
     * @param team
     * @param className
     */
    public void addContract(Integer year, MemberType memberType, Integer member, String team, String className);

    /**
     * 
     * @return
     */
    public ObservableList<Contract> getRiderContracts();

    /**
     * 
     * @return
     */
    public ObservableList<Contract> getEngineerContracts();

    /**
     * 
     * @return
     */
    public ObservableList<Contract> getMechanicContracts();

    /**
     * 
     * @param year
     * @param rider
     * @return
     */
    public String getClassFromRiderYear(int year, int rider);
}
