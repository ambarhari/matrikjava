class test {
    public static void main(String[] args) {

        // Test Student class
        Student s1 = new Student("Ujang", "Cikukulu");
        s1.addCourseGrade("PEMROGRAMAN", 76);
        s1.addCourseGrade("JARINGAN", 68);
        s1.printGrades();
        System.out.println("Average is " + s1.getAverageGrade());

        // Test Teacher class
        Teacher t1 = new Teacher("IMAN", "CIBADAK");
        System.out.println(t1);
        String[] courses = { "PEMROGRAMAN", "JARINGAN", "DATABASE" };
        for (String course : courses) {
            if (t1.addCourse(course)) {
                System.out.println(course + " ditambahkan.");
            } else {
                System.out.println(course + " penambahan gagal.");
            }
        }
        for (String course : courses) {
            if (t1.removeCourse(course)) {
                System.out.println(course + " dihapus.");
            } else {
                System.out.println(course + " penghapusan gagal.");
            }
        }
    }

}
