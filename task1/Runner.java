package task1;

public interface Runner {
    /***
     * Прыжок
     * height - параметр высоты прыжка
     * возвращаемое занчение - результат прыжка: удалось-не удалось перепрыгнуть
     */

    default boolean jump(int height) {
        if (height<=getMaxJump()){
            System.out.printf("%s has jumped over the wall %d meters high." +
                    "\n", getName(), height);
            return true;
        }
        else {System.out.printf("%s has failed jump over the wall %d meters high." +
                "\n", getName(), height);
            return false;}
    }

    /**
     * Бег
     *
     * @param length дистанция, на которую может пробежать бегун
     * @return результат - добежал до конца или нет.
     */
    default boolean run(int length) {
        if (length<=getMaxRun()){
            System.out.printf("%s has run whole %d meters distance." +
                    "\n", getName(), length);
            return true;
        }
        else{System.out.printf("%s has failed run %d meters distance." +
                "\n", getName(), length);
            return false;}
    }

    /** Получить имя
 * @return Имя бегуна
 * /
 */
    String getName();
/**@return Сколько может пробежать за раз максимально
 * /
 */
    int getMaxRun();
/**@return  Максимальная высота прыжка
 * /
 */
    int getMaxJump();


}
