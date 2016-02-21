package ru.lesson.lessons;

/**
*	Класс реализует калькулятор.
*/
public class Calculator {
	/**
	*	Результат вычисления.
	*/
	private int result;

	/**
	*	Суммируем аргументы.
	*	@param params Аргументы суммирования.	
	*/ 
	public void add(int ... params) {
		for (Integer param : params) {
			this.result += param;
		}
	}

	/**
	 * Вычисляем деление.
	 * @param args Входящие аргументы.
	 * @throws UserException Если аргументов нет, выкидываем исключение.
     */
	public void div(int ... args) throws UserException  {
		if (args.length > 1) {
			this.result = args[0];
			for (int param : args) {
				if (param == 0) {
					throw new IllegalArgumentException("You try to div by 0. Please change arg!");
				}
				this.result /= param;
			}
		} else {
			throw new UserException("You should enter args!");
		}
	}

	/**
	*	Получить результат.
	*	@return Результат вычисления.
	*/	
	public int getResult() {
		return this.result;
	}

	/**
	*	Очистить результат вычисления.
	*/
	public void clearResult() {
		this.result = 0;
	}
}