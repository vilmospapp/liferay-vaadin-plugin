package com.arcusys.liferay.vaadinplugin.util;

/*
 * #%L
 * Liferay Vaadin Plugin
 * %%
 * Copyright (C) 2013 Arcusys Ltd.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Igor.Borisov
 * Date: 21.03.13
 * Time: 12:22
 */
public class VaadinFileInfo {
    private final String name;
    private final String place;
    private final String innerSourcePath;
    private final Integer orderPriority;
    private final Boolean needForCompilation;

    public VaadinFileInfo(String name, String place, int orderPriority) {
        this(name, place, orderPriority, "", false);
    }

    public VaadinFileInfo(String name, String place, int orderPriority, String innerSourcePath) {
        this(name, place, orderPriority, innerSourcePath, false);
    }

    public VaadinFileInfo(String name, String place, int orderPriority, Boolean needForCompilation) {
        this(name, place, orderPriority, "", needForCompilation);
    }

    public VaadinFileInfo(String name, String place, int orderPriority, String innerSourcePath, Boolean needForCompilation) {
        this.name = name;
        this.place = place;
        this.innerSourcePath = innerSourcePath;
        this.orderPriority = orderPriority;
        this.needForCompilation = needForCompilation;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public String getInnerSourcePath() {
        return innerSourcePath;
    }

    public Integer getOrderPriority() {
        return orderPriority;
    }

    public Boolean getNeedForCompilation() {
        return needForCompilation;
    }

    public File getLocation() { return new File(place, name);}
}
