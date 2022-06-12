/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.translate;

import dev.kalenchukov.translate.sources.Standard;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * Класс транслитерации.
 */
public class Transliterator
{
	/**
	 * Конструктор для {@code Transliterator} запрещающий создавать объект класса.
	 */
	private Transliterator() {}

	/**
	 * Выполняет транслитерацию текста по стандарту установленному по умолчанию - ICAO DOC 9303.
	 *
	 * @param text Текст.
	 * @return Транслитерированный текст.
	 */
	@NotNull
	public static String translate(@NotNull final String text)
	{
		Objects.requireNonNull(text);

		Translating translate = new Translate(Standard.ICAO_DOC_9303);

		return translate.translate(text);
	}

	/**
	 * Выполняет транслитерацию текста.
	 *
	 * @param text Текст.
	 * @param standard Стандарт.
	 * @return Транслитерированный текст.
	 */
	@NotNull
	public static String translate(@NotNull final String text, @NotNull final Standard standard)
	{
		Objects.requireNonNull(text);
		Objects.requireNonNull(standard);

		Translating translate = new Translate(standard);

		return translate.translate(text);
	}
}
