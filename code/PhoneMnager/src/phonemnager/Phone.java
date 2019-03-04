/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonemnager;

import com.sun.xml.internal.ws.policy.sourcemodel.ModelNode;

/**
 *
 * @author Asus
 */
public class Phone {

    private String brand;
    private String color;
    private String modelNO;
    private String serialNO;
    private String IMEI;
    private String memory;
    private String sotrage;

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the modelNO
     */
    public String getModelNO() {
        return modelNO;
    }

    /**
     * @param modelNO the modelNO to set
     */
    public void setModelNO(String modelNO) {
        this.modelNO = modelNO;
    }

    /**
     * @return the serialNO
     */
    public String getSerialNO() {
        return serialNO;
    }

    /**
     * @param serialNO the serialNO to set
     */
    public void setSerialNO(String serialNO) {
        this.serialNO = serialNO;
    }

    /**
     * @return the IMEI
     */
    public String getIMEI() {
        return IMEI;
    }

    /**
     * @param IMEI the IMEI to set
     */
    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    /**
     * @return the memory
     */
    public String getMemory() {
        return memory;
    }

    /**
     * @param memory the memory to set
     */
    public void setMemory(String memory) {
        this.memory = memory;
    }

    /**
     * @return the sotrage
     */
    public String getSotrage() {
        return sotrage;
    }

    /**
     * @param sotrage the sotrage to set
     */
    public void setSotrage(String sotrage) {
        this.sotrage = sotrage;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
}
