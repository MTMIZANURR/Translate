/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.translate;

import dev.kalenchukov.translate.sources.Standard;
import org.jetbrains.annotations.NotNull;

/**
 * Класс транслитерации.
 */
public class Translate extends AbstractTranslate
{
	/**
	 * @see AbstractTranslate#AbstractTranslate(Standard)
	 */
	public Translate(@NotNull final Standard standard)
	{
		super(standard);
	}
}
