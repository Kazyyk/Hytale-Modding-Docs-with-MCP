# ImageCarta

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.framework.cartas | Extends: TriCarta<R>

public class ImageCarta<R> extends TriCarta<R>

Concrete implementation extending `TriCarta<R>`.

## Fields

- rgbArray | int[] | int[] field.
- width | int | int field.
- height | int | int field.
- functionX | TriDoubleFunction<Double> | TriDoubleFunction<Double> field.
- functionY | TriDoubleFunction<Double> | TriDoubleFunction<Double> field.
- rgbToTerrainMap | Map<Integer, R> | Map<Integer, R> field.
- allPossibleValues | List<R> | List<R> field.

## Constructors

- ImageCarta() | Creates a new ImageCarta instance.

## Methods

- apply(int x, int y, int z, @Nonnull WorkerIndexer.Id tHreadId) | R | public method.
- allPossibleValues() | List<R> | public method.
- greenFromRgb(int rgb) | int | static public method.
- redFromRgb(int rgb) | int | static public method.
- blueFromRgb(int rgb) | int | static public method.
- coloursToRgb(int red, int green, int blue) | int | static public method.
- toString() | String | public method.

Also in this package: Builder, LayeredCarta, SingleElementCarta

Complete API:
  public R apply(int x, int y, int z, WorkerIndexer.Id tHreadId)
  public List<R> allPossibleValues()
  public static int greenFromRgb(int rgb)
  public static int redFromRgb(int rgb)
  public static int blueFromRgb(int rgb)
  public static int coloursToRgb(int red, int green, int blue)
  public String toString()

Fields:
private int[] rgbArray
private int width
private int height
private TriDoubleFunction<Double> functionX
private TriDoubleFunction<Double> functionY
private Map<Integer,R> rgbToTerrainMap
private List<R> allPossibleValues
