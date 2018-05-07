
import javax.swing.*;
import java.awt.Color;


/*======================================*/
/* This class acts as an mediator class */
/* in the mediator design pattern       */
/*======================================*/


public class BusinessMediator{

   private HotelGUI    hotelGui;
   private AirlineGUI  airlineGui;
   private TourGUI     tourGui;
   private TouriststoreGUI     touriststoreGui;

   public void registerHotelGUI(HotelGUI hg){
      hotelGui = hg;
   }
   public void registerAirlineGUI(AirlineGUI ag){
      airlineGui = ag;
   }
   public void registerTourGUI(TourGUI tg){
      tourGui = tg;
   }
   /*
    * Created by olive-team in 2018/5/7
    */
   public void registerTouriststoreGUI(TouriststoreGUI tsg){
	      touriststoreGui = tsg;
	   }


  public void addAllCandidateCus(String option, String text){
  	 if(option.compareTo(AirlineGUI.AIR)==0){
  	    hotelGui.addCandidateCustomer(text);
  	    tourGui.addCandidateCustomer(text);
  	    touriststoreGui.addCandidateCustomer(text);//Created by olive-team in 2018/5/7
     }
     else if(option.compareTo(HotelGUI.HOTEL)==0){
	    airlineGui.addCandidateCustomer(text);
	    tourGui.addCandidateCustomer(text);
	    touriststoreGui.addCandidateCustomer(text);//Created by olive-team in 2018/5/7
     }
     else if(option.compareTo(TourGUI.TOUR)==0){
	    hotelGui.addCandidateCustomer(text);
	    airlineGui.addCandidateCustomer(text);
	    touriststoreGui.addCandidateCustomer(text);//Created by olive-team in 2018/5/7
     }
  	 /*
      * Created by olive-team in 2018/5/7
      */
     else if(option.compareTo(TouriststoreGUI.TOURSTORE)==0){
 	    airlineGui.addCandidateCustomer(text);
 	    hotelGui.addCandidateCustomer(text);
 	    tourGui.addCandidateCustomer(text);
      }
  }


  public void updateALlGuis(String option, String text){
	  if(option.compareTo(AirlineGUI.AIR)==0){
	     hotelGui.displayInfoToScreen(text);
	     tourGui.displayInfoToScreen(text);
	     touriststoreGui.displayInfoToScreen(text);//Created by olive-team in 2018/5/7
      }
      else if(option.compareTo(HotelGUI.HOTEL)==0){
	  	 airlineGui.displayInfoToScreen(text);
	  	 tourGui.displayInfoToScreen(text);
	   	 touriststoreGui.displayInfoToScreen(text);//Created by olive-team in 2018/5/7
      }
      else if(option.compareTo(TourGUI.TOUR)==0){
	  	 hotelGui.displayInfoToScreen(text);
	  	 airlineGui.displayInfoToScreen(text);
	  	 touriststoreGui.displayInfoToScreen(text);//Created by olive-team in 2018/5/7
      }
	  /*
	    * Created by olive-team in 2018/5/7
	    */
      else if(option.compareTo(TouriststoreGUI.TOURSTORE)==0){
    	  hotelGui.displayInfoToScreen(text);
    	  airlineGui.displayInfoToScreen(text);
 	  	  tourGui.displayInfoToScreen(text);
       }
  }
}