# ColorParseUtil

Type: class | Package: com.hypixel.hytale.server.core.asset.util

public class ColorParseUtil

## Fields

- public static final Pattern HEX_COLOR_PATTERN
- public static final Pattern HEX_ALPHA_COLOR_PATTERN
- public static final Pattern RGB_COLOR_PATTERN
- public static final Pattern RGBA_COLOR_PATTERN
- public static final Pattern RGBA_HEX_COLOR_PATTERN

## Methods

- @Nullable public static ColorAlpha readColorAlpha(@Nonnull RawJsonReader reader)
- @Nullable public static ColorAlpha parseColorAlpha(@Nonnull String stringValue)
- @Nullable public static Color readColor(@Nonnull RawJsonReader reader)
- @Nullable public static Color parseColor(@Nonnull String stringValue)
- @Nonnull public static Color readHexStringToColor(@Nonnull RawJsonReader reader)
- @Nonnull public static Color hexStringToColor(String color)
- @Nonnull public static ColorAlpha readHexStringToColorAlpha(@Nonnull RawJsonReader reader)
- @Nonnull public static ColorAlpha hexStringToColorAlpha(String color)
- public static int readHexAlphaStringToRGBAInt(@Nonnull RawJsonReader reader)
- public static int hexAlphaStringToRGBAInt(String color)
- public static int readHexStringToRGBInt(@Nonnull RawJsonReader reader)
- public static int hexStringToRGBInt(String color)
- @Nonnull public static String colorToHexString(@Nullable Color color)
- @Nonnull public static String colorToHexAlphaString(@Nullable ColorAlpha color)
- @Nonnull public static Color readRgbStringToColor(@Nonnull RawJsonReader reader)
- @Nonnull public static Color rgbStringToColor(String color)
- @Nonnull public static ColorAlpha readRgbaStringToColorAlpha(@Nonnull RawJsonReader reader)
- @Nonnull public static ColorAlpha readRgbaDecimalStringToColor(@Nonnull RawJsonReader reader)
- @Nonnull public static ColorAlpha readRgbaDecimalStringToColor(@Nonnull RawJsonReader reader, boolean readStart)
- @Nonnull public static ColorAlpha rgbaDecimalStringToColor(String color)
- @Nonnull public static ColorAlpha readRgbaHexStringToColor(@Nonnull RawJsonReader reader)
- @Nonnull public static ColorAlpha readRgbaHexStringToColor(@Nonnull RawJsonReader reader, boolean readStart)
- @Nonnull public static ColorAlpha rgbaHexStringToColor(String color)
- @Nonnull public static String colorToHex(@Nullable java.awt.Color color)
- @Nonnull public static String colorToHexAlpha(@Nullable java.awt.Color color)
- public static int colorToARGBInt(@Nullable Color color)
- public static void hexStringToColorLightDirect(@Nonnull ColorLight colorLight, @Nonnull String color)
- @Nonnull public static String colorLightToHexString(@Nonnull ColorLight colorLight)
- @Nonnull public static String toHexString(byte red, byte green, byte blue)
- @Nonnull public static String toHexString(int rgb)
- @Nonnull public static String toHexAlphaString(byte red, byte green, byte blue, byte alpha)
- @Nonnull public static String toHexAlphaString(int rgba)
