package jacobsen.woinfo.androidroomdatabase.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;

@Entity(tableName = "exercises")
public class Exercise {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "name")
    private final String name;

    @ColumnInfo(name = "description")
    private final String description;

    @ColumnInfo(name = "label")
    private final String label;

    @ColumnInfo(name = "short_groups")
    private final String shortGroups;

    @ColumnInfo(name = "long_groups")
    private final String longGroups;

    @ColumnInfo(name = "equipment")
    private final String equipment;

    @ColumnInfo(name = "body_weight_option")
    private final boolean bodyWeightOption;

    public Exercise(@NonNull String name, String description, String label, String shortGroups, String longGroups, String equipment, Boolean bodyWeightOption) {
        this.name = name;
        this.description = description;
        this.label = label;
        this.shortGroups = shortGroups;
        this.longGroups = longGroups;
        this.equipment = equipment;
        this.bodyWeightOption = bodyWeightOption;
    }

    public @NonNull String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getLabel() {
        return label;
    }

    public String getShortGroups() {
        return shortGroups;
    }

    public String getLongGroups() {
        return longGroups;
    }

    public String getEquipment() {
        return equipment;
    }

    public Boolean getBodyWeightOption() {
        return bodyWeightOption;
    }

    private static ArrayList<Exercise> exerciseArrayList = new ArrayList<>();


    private static Exercise exBackSquat = new Exercise(
            "Squat",
            "The squat is performed by squatting down with a weight held across the upper back under neck and standing up straight again.",
            "Legs",
            "Quadriceps",
            "Quadriceps, Glutes, Hamstrings, Calves, Lower Back",
            "Barbell",
            true);

    private static Exercise exFrontSquat = new Exercise(
            "Squat (Front)",
            "desc",
            "Legs",
            "Quadriceps",
            "Quadriceps, Glutes, Hamstrings, Calves, Lower Back",
            "Barbell",
            true);

    private static Exercise exBoxSquat = new Exercise(
            "Squat (Box)",
            "desc",
            "Legs",
            "Quadriceps",
            "Quadriceps, Glutes, Hamstrings, Calves, Lower Back",
            "Barbell",
            true);

    private static Exercise exLegPress = new Exercise(
            "Leg Press",
            "The leg press is performed while seated by pushing a weight away from the body with the feet.",
            "Legs",
            "Glutes",
            "Glutes, Hamstrings, Calves",
            "Leg Press Machine",
            false);

    private static Exercise exLegExtension = new Exercise(
            "Leg Extension",
            "The leg extension is performed while seated by raising a weight out in front of the body with the feet.",
            "Legs",
            "Mid Back",
            "Biceps, Forearms, Rear Deltoids",
            "Cable Machine, Pulldown Machine",
            false);

    private static Exercise exWallSit = new Exercise(
            "Wall Sit",
            "The wall sit, also known as a static squat, is performed by placing one's back against a wall with feet shoulder width apart, and lowering the hips until the knees and hips are both at right angles. The position is held as long as possible.",
            "Legs",
            "Quadriceps",
            "Quadriceps",
            "Body Weight, Wall or Flat Surface",
            true);

    private static Exercise exStandingCalfRaise = new Exercise(
            "Calf Raise (Standing)",
            "The standing calf raise is performed by plantarflexing the feet to lift the body. If a weight is used, then it rests upon the shoulders, or is held in the hand(s).",
            "Legs",
            "Calves",
            "Calves, Gastrocnemius Muscle, Soleus Muscle",
            "Body Weight, Dumbbells",
            true);

    private static Exercise exSeatedCalfRaise = new Exercise(
            "Calf Raise (Seated)",
            "The seated calf raise is performed by flexing the feet to lift a weight held on the knees.",
            "Legs",
            "Calves",
            "Calves, Soleus Muscle",
            "Barbell, Seated Calf Raise Machine, Leg Press Machine",
            false);

    private static Exercise exBenchPress = new Exercise(
            "Bench Press (Barbell)",
            "The bench press is performed while lying face up on a bench, by pushing a weight away from the chest.",
            "Chest",
            "Pectorals",
            "Pectorals, Triceps, Front Deltoids, Upper and Lower Back Muscles, Traps",
            "Barbell, Smith Machine, Bench Press Machine",
            false);

    private static Exercise exBenchPressNarrowGrip = new Exercise(
            "Bench Press (Barbell Narrow Grip)",
            "The bench press is performed while lying face up on a bench, by pushing a weight away from the chest.",
            "Chest",
            "Triceps",
            "Triceps, Pectorals, Front Deltoids, Upper and Lower Back Muscles, Traps",
            "Barbell, Smith Machine, Bench Press Machine",
            false);

    private static Exercise exDumbbellBenchPress = new Exercise(
            "Bench Press (Dumbbell)",
            "The bench press is performed while lying face up on a bench, by pushing a two weights directly up and away from the chest.",
            "Chest",
            "Pectorals",
            "Pectorals, Triceps, Front Deltoids, Upper and Lower Back Muscles, Traps",
            "Dumbbell, Smith Machine, Bench Press Machine",
            false);

    private static Exercise exInclineBenchPress = new Exercise(
            "Bench Press (Incline)",
            "The bench press is performed while lying face up below horizontal on a bench, by pushing a weight away from the chest.",
            "Chest",
            "Upper Pectorals",
            "Upper Pectorals, Triceps, Front Deltoids, Upper and Lower Back Muscles, Traps",
            "Barbell, Smith Machine, Inclined Bench Press Machine",
            false);

    private static Exercise exDeclineBenchPress = new Exercise(
            "Bench Press (Decline)",
            "The bench press is performed while lying face up beyond horizontal on a bench, by pushing a weight away from the chest.",
            "Chest",
            "Lower Pectorals",
            "Lower Pectorals, Triceps, Front Deltoids, Upper and Lower Back Muscles, Traps",
            "Barbell, Smith Machine, Declined Bench Press Machine",
            false);

    private static Exercise exPushUps = new Exercise(
            "Pushups",
            "desc",
            "Chest",
            "Mid Back",
            "Biceps, Forearms, Rear Deltoids",
            "Cable Machine, Pulldown Machine",
            true);

    private static Exercise exVerticalDips = new Exercise(
            "Dips (Vertical)",
            "desc",
            "Back",
            "Mid Back",
            "Biceps, Forearms, Rear Deltoids",
            "Cable Machine, Pulldown Machine",
            true);

    private static Exercise exHorizontalDips = new Exercise(
            "Dips (Horizontal)",
            "desc",
            "Back",
            "Mid Back",
            "Biceps, Forearms, Rear Deltoids",
            "Cable Machine, Pulldown Machine",
            true);

    private static Exercise exChestFly = new Exercise(
            "Chest Fly",
            "The chest fly is performed while lying face up on a bench or standing up, with arms outspread holding weights, by bringing the arms together above the chest.",
            "Back",
            "Mid Back",
            "Biceps, Forearms, Rear Deltoids",
            "Cable Machine, Pulldown Machine",
            false);

    private static Exercise exCableCrossovers = new Exercise(
            "Cable Crossovers",
            "desc",
            "Back",
            "Mid Back",
            "Biceps, Forearms, Rear Deltoids",
            "Cable Machine, Pulldown Machine",
            false);

    private static Exercise exPulldown = new Exercise(
            "Pulldown",
            "desc",
            "Back",
            "Mid Back",
            "Biceps, Forearms, Rear Deltoids",
            "Cable Machine, Pulldown Machine",
            false);

    private static Exercise exPulldownWideArm = new Exercise(
            "Pulldown (Wide Arm)",
            "desc",
            "Back",
            "Mid Back",
            "Biceps, Forearms, Rear Deltoids",
            "Cable Machine, Pulldown Machine",
            false);

    private static Exercise exPullUp = new Exercise(
            "Pull-up",
            "desc",
            "Back",
            "Mid Back",
            "Biceps, Forearms, Traps, Rear Deltoids",
            "Pull-up Bar, Pull-up Machine",
            true);

    private static Exercise exPullUpWideArm = new Exercise(
            "Pull-up (Wide Arm)",
            "desc",
            "Back",
            "Mid Back",
            "Lats, Biceps, Forearms, Traps, Rear Deltoids",
            "Pull-up Bar, Pull-up Machine",
            true);

    private static Exercise exChinUp = new Exercise(
            "Chin-up",
            "desc",
            "Arms",
            "Biceps",
            "Biceps, Forearms, Traps, Rear Deltoids",
            "Pull-up Bar, Pull-up Machine",
            true);


    private static Exercise exBentOverRow = new Exercise(
            "Bent Over Row",
            "desc",
            "Arms",
            "Biceps",
            "Biceps, Forearms, Traps, Rear Deltoids",
            "Pull-up Bar, Pull-up Machine",
            false);

    private static Exercise exUprightRow = new Exercise(
            "Upright Row",
            "desc",
            "Arms",
            "Biceps",
            "Biceps, Forearms, Traps, Rear Deltoids",
            "Pull-up Bar, Pull-up Machine",
            false);

    private static Exercise exShoulderPress = new Exercise(
            "Shoulder Press",
            "desc",
            "Arms",
            "Biceps",
            "Biceps, Forearms, Traps, Rear Deltoids",
            "Pull-up Bar, Pull-up Machine",
            false);

    private static Exercise exMilitaryPress = new Exercise(
            "Military Press",
            "desc",
            "Arms",
            "Biceps",
            "Biceps, Forearms, Traps, Rear Deltoids",
            "Pull-up Bar, Pull-up Machine",
            false);

    private static Exercise exLateralRaise = new Exercise(
            "Lateral Raise",
            "desc",
            "Arms",
            "Biceps",
            "Biceps, Forearms, Traps, Rear Deltoids",
            "Pull-up Bar, Pull-up Machine",
            false);

    private static Exercise exPushDown = new Exercise(
            "Push Down",
            "desc",
            "Arms",
            "Biceps",
            "Biceps, Forearms, Traps, Rear Deltoids",
            "Pull-up Bar, Pull-up Machine",
            false);

    private static Exercise exTricepsExtension = new Exercise(
            "Triceps Extension",
            "desc",
            "Arms",
            "Biceps",
            "Biceps, Forearms, Traps, Rear Deltoids",
            "Pull-up Bar, Pull-up Machine",
            false);

    private static Exercise exPreacherCurl = new Exercise(
            "Preacher Curl",
            "desc",
            "Arms",
            "Biceps",
            "Biceps, Forearms, Traps, Rear Deltoids",
            "Pull-up Bar, Pull-up Machine",
            false);

    private static Exercise exStandBBCurl = new Exercise(
            "Standing Barbell Curl",
            "desc",
            "Arms",
            "Biceps",
            "Biceps, Forearms, Traps, Rear Deltoids",
            "Pull-up Bar, Pull-up Machine",
            false);

    private static Exercise exAltRotDBCurl = new Exercise(
            "Alternating Rotating Dumbbell Curl",
            "desc",
            "Arms",
            "Biceps",
            "Biceps, Forearms, Traps, Rear Deltoids",
            "Pull-up Bar, Pull-up Machine",
            false);

    private static Exercise exHammerCurl = new Exercise(
            "Hammer Curl",
            "desc",
            "Arms",
            "Biceps",
            "Biceps, Forearms, Traps, Rear Deltoids",
            "Pull-up Bar, Pull-up Machine",
            false);

    private static Exercise exZottmannCurl = new Exercise(
            "Zottmann Curl",
            "desc",
            "Arms",
            "Biceps",
            "Biceps, Forearms, Traps, Rear Deltoids",
            "Pull-up Bar, Pull-up Machine",
            false);

    private static Exercise exCrunch = new Exercise(
            "Crunch",
            "desc",
            "Arms",
            "Biceps",
            "Biceps, Forearms, Traps, Rear Deltoids",
            "Pull-up Bar, Pull-up Machine",
            true);

    private static Exercise exLemonSqueezer = new Exercise(
            "Lemon Squeezer",
            "desc",
            "Arms",
            "Biceps",
            "Biceps, Forearms, Traps, Rear Deltoids",
            "Pull-up Bar, Pull-up Machine",
            true);

    private static Exercise exVUp = new Exercise(
            "V-Up",
            "desc",
            "Arms",
            "Biceps",
            "Biceps, Forearms, Traps, Rear Deltoids",
            "Pull-up Bar, Pull-up Machine",
            true);

    private static Exercise exFlutterKicks = new Exercise(
            "Flutter Kicks",
            "desc",
            "Arms",
            "Biceps",
            "Biceps, Forearms, Traps, Rear Deltoids",
            "Pull-up Bar, Pull-up Machine",
            true);

    private static Exercise exQuarterSitups = new Exercise(
            "QuarterSitups",
            "desc",
            "Arms",
            "Biceps",
            "Biceps, Forearms, Traps, Rear Deltoids",
            "Pull-up Bar, Pull-up Machine",
            true);

    private static Exercise exLegRaise = new Exercise(
            "Leg Raise",
            "desc",
            "Arms",
            "Biceps",
            "Biceps, Forearms, Traps, Rear Deltoids",
            "Pull-up Bar, Pull-up Machine",
            true);

    private static Exercise exRussianTwist = new Exercise(
            "Russian Twist",
            "desc",
            "Arms",
            "Biceps",
            "Biceps, Forearms, Traps, Rear Deltoids",
            "Pull-up Bar, Pull-up Machine",
            true);

    private static Exercise exBackExtension = new Exercise(
            "Back Extension",
            "desc",
            "Arms",
            "Biceps",
            "Biceps, Forearms, Traps, Rear Deltoids",
            "Pull-up Bar, Pull-up Machine",
            true);

    private static Exercise exDeadlift = new Exercise(
            "Dead Lift",
            "desc",
            "Arms",
            "Biceps",
            "Biceps, Forearms, Traps, Rear Deltoids",
            "Pull-up Bar, Pull-up Machine",
            false);

    private static Exercise exSumoLift = new Exercise(
            "Dead Lift (Sumo)",
            "desc",
            "Arms",
            "Biceps",
            "Biceps, Forearms, Traps, Rear Deltoids",
            "Pull-up Bar, Pull-up Machine",
            false);

    private static Exercise exGoodMorning = new Exercise(
            "Good Morning",
            "desc",
            "Arms",
            "Biceps",
            "Biceps, Forearms, Traps, Rear Deltoids",
            "Pull-up Bar, Pull-up Machine",
            false);

    public static ArrayList<Exercise> fillExerciseArrayList() {
        exerciseArrayList.add(exBackSquat);
        exerciseArrayList.add(exFrontSquat);
        exerciseArrayList.add(exBoxSquat);
        exerciseArrayList.add(exLegPress);
        exerciseArrayList.add(exLegExtension);
        exerciseArrayList.add(exWallSit);
        exerciseArrayList.add(exStandingCalfRaise);
        exerciseArrayList.add(exSeatedCalfRaise);
        exerciseArrayList.add(exBenchPress);
        exerciseArrayList.add(exBenchPressNarrowGrip);
        exerciseArrayList.add(exDumbbellBenchPress);
        exerciseArrayList.add(exInclineBenchPress);
        exerciseArrayList.add(exDeclineBenchPress);
        exerciseArrayList.add(exPushUps);
        exerciseArrayList.add(exVerticalDips);
        exerciseArrayList.add(exHorizontalDips);
        exerciseArrayList.add(exChestFly);
        exerciseArrayList.add(exCableCrossovers);
        exerciseArrayList.add(exPulldown);
        exerciseArrayList.add(exPulldownWideArm);
        exerciseArrayList.add(exPullUp);
        exerciseArrayList.add(exPullUpWideArm);
        exerciseArrayList.add(exChinUp);
        exerciseArrayList.add(exBentOverRow);
        exerciseArrayList.add(exUprightRow);
        exerciseArrayList.add(exShoulderPress);
        exerciseArrayList.add(exMilitaryPress);
        exerciseArrayList.add(exLateralRaise);
        exerciseArrayList.add(exPushDown);
        exerciseArrayList.add(exTricepsExtension);
        exerciseArrayList.add(exPreacherCurl);
        exerciseArrayList.add(exStandBBCurl);
        exerciseArrayList.add(exAltRotDBCurl);
        exerciseArrayList.add(exHammerCurl);
        exerciseArrayList.add(exZottmannCurl);
        exerciseArrayList.add(exCrunch);
        exerciseArrayList.add(exLemonSqueezer);
        exerciseArrayList.add(exVUp);
        exerciseArrayList.add(exFlutterKicks);
        exerciseArrayList.add(exQuarterSitups);
        exerciseArrayList.add(exLegRaise);
        exerciseArrayList.add(exRussianTwist);
        exerciseArrayList.add(exBackExtension);
        exerciseArrayList.add(exDeadlift);
        exerciseArrayList.add(exSumoLift);
        exerciseArrayList.add(exGoodMorning);
        return exerciseArrayList;
    }


/*
    public class Calender {

        public Calender (ArrayList<Date> dates) {

        }

        class Date {
            int exDay;
            int exMonth;
            int exYear;

            public Date(int day, int month, int year) {
                exDay = day;
                exMonth = month;
                exYear = year;
            }

            private String formattedDateSimple(Date date) {
                return (date.exMonth + "/" + date.exDay + "/" + date.exYear);
            }

            private String formattedDateLong(Date date) {
                return (monthToString(date.exMonth) + " " + date.exDay + ", " + date.exYear);
            }

            private String monthToString(int month) {
                switch (month) {
                    case (1):
                        return "January";
                    case (2):
                        return "February";
                    case (3):
                        return "March";
                    case (4):
                        return "April";
                    case (5):
                        return "May";
                    case (6):
                        return "June";
                    case (7):
                        return "July";
                    case (8):
                        return "August";
                    case (9):
                        return "September";
                    case (10):
                        return "October";
                    case (11):
                        return "November";
                    case (12):
                        return "December";

                    default:
                        throw new RuntimeException("Invalid month entered somehow");
                }
            }
        }
    }
*/

//    ExerciseRoomDatabase db = Room.databaseBuilder(getApplicationContext(),
//            ExerciseRoomDatabase.class, "database-name").build();

}