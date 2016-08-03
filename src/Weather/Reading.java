package Weather;
class Reading {

    private String _day_of_the_week;
    private int _hour_of_day;
    private int _temp;
    private int _wind_speed;

    public Reading(String line) {
        String[] elements = line.split(", ");
        _day_of_the_week = elements[0];
        _hour_of_day = Integer.valueOf(elements[1]);
        _temp = Integer.valueOf(elements[2]);
        _wind_speed = Integer.valueOf(elements[3]);
    }

    public String rateTemperature(){
        if(_temp < 55) return "cold";
        else if (_temp >=55 & _temp < 65) return "mild";
        else if (_temp >= 65 & _temp < 80) return "warm";
        else if (_temp >= 80) return "hot";
        else return "";
    }

    public String getTime() {
        if (_hour_of_day == 9) {
            return _day_of_the_week + " morning";
        } else if (_hour_of_day == 15){
            return  _day_of_the_week + " afternoon";
        }else if ( _hour_of_day == 21){
            return _day_of_the_week + " evening";
        }
        else return "";
    }


}
