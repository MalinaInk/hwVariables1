public class Main {
    public static void main(String[] args) {
        // 1 задача
        double dog = 8;
        double cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7_639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // 2 задача
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        // 3 задача
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // 4 задача
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес боксеров = " + totalWeight);
        var differenceWeight = boxerWeight2 - boxerWeight1;
        System.out.println("Разница веса боксеров = " + differenceWeight);
        differenceWeight = boxerWeight2 % boxerWeight1;
        System.out.println("Разница веса боксеров = " + differenceWeight);
        // 5 задача
        var workTimeAll = 640;
        var workTimePersonal = 8;
        var workersQuantity = workTimeAll / workTimePersonal;
        System.out.println("Всего работников в компании – " + workersQuantity + " человек");
        workersQuantity = workersQuantity + 94;
        workTimeAll = workersQuantity * 8;
        System.out.println("Если в компании работает " + workersQuantity + " человек, то всего " + workTimeAll + " часов работы может быть поделено между сотрудниками");
    }
}