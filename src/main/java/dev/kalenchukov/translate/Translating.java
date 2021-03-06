/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.translate;

import org.jetbrains.annotations.NotNull;

/**
 * Интерфейс для реализации классов транслитерации.
 */
public interface Translating
{
	/**
	 * Выполняет транслитерацию текста.
	 *
	 * @param text Текст.
	 * @return Транслитерированный текст.
	 */
	@NotNull
	String translate(@NotNull String text);
}
