package task1;

public class Race {
    public static void main(String[] args) {
        Obstacle[] obstacles = {
                new Track(1200),
                new Wall(3),
                new Track(2000),
                new Wall(2),
                new Track(3000),
                new Wall(4)
        };


        Runner[] runners = {
                new Cat("Jiji",1500, 2),
                new Cat("Kitty", 1700, 1),
                new Robot("Bender", 99999, 3),
                new Robot("Helper", 5000, 6),
                new Human("Oleg", 4000, 5),
                new Human("Zukhra", 5000, 0)

        };


        for (Runner r: runners){
            for (Obstacle o: obstacles){
                if(o instanceof Track)  {
                    if(!r.run(o.getLength()))
                        break;

                }else {
                    if(o instanceof Wall){
                        if(!r.jump(o.getHeight()))
                            break;
                    }
                }





            }
        }

    }
}

