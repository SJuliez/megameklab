/*
 * MegaMekLab - Copyright (C) 2008 
 * 
 * Original author - jtighe (torren@users.sourceforge.net)
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details.
 */

package megameklab.com.util;

import java.awt.Image;

import javax.swing.ImageIcon;

import megamek.common.BipedMech;
import megamek.common.Entity;
import megamek.common.QuadMech;



public class ImageHelper {
    public static String recordSheetPath = "./data/images/recordsheets/";
    public static String fluffPath = "./data/images/fluff/";
    
    
    public static Image getRecordSheet(Entity unit, boolean advanced){
        
        Image recordSheet = null;
        
        if ( unit instanceof BipedMech ){
            if ( advanced ){
                recordSheet = new ImageIcon(recordSheetPath+"tobiped.png").getImage();
            }else {
                recordSheet = new ImageIcon(recordSheetPath+"twbiped.png").getImage();
            }
        } else if ( unit instanceof QuadMech ){
            if ( advanced ){
                recordSheet = new ImageIcon(recordSheetPath+"toquad.png").getImage();
            }else {
                recordSheet = new ImageIcon(recordSheetPath+"twquad.png").getImage();
            }
        }
        
        return recordSheet;
    }
    
    public static Image getFluffImage(Entity unit){
        Image fluff = null;
        
        
        
        return fluff;
    }
    
    public static Image getFluffPNG(Entity unit){
        Image fluff = null;
        
        
        
        return fluff;
    }

    public static Image getFluffJPG(Entity unit){
        Image fluff = null;
        
        
        
        return fluff;
    }

    public static Image getFluffGIF(Entity unit){
        Image fluff = null;
        
        
        
        return fluff;
    }


}