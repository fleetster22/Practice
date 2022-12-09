public class Professor extends Person {
        public String courseTaught;
        public String lastName;


        public Professor(short id, String firstName, String lastName, String email, String courseTaught, String lastName1) {
                super(id, firstName, lastName, email);
                this.courseTaught = courseTaught;
                this.lastName = lastName1;
        }

        public String getCourseTaught() {
                return courseTaught;
        }

        public void setCourseTaught(String courseTaught) {
                this.courseTaught = courseTaught;
        }

        @Override
        public String getLastName() {
                return lastName;
        }

        @Override
        public void setLastName(String lastName) {
                this.lastName = lastName;
        }
}

// override id to say EmployeeID
