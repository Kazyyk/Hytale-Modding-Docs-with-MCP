# IntMap

Type: class | Package: com.hypixel.hytale.server.worldgen.climate.util

public class IntMap

Fixed-size 2D grid of `int` values backed by a flat array. Used by the climate system for storing discrete-valued spatial data such as biome IDs. Values default to -1 when cleared.

## Fields

- width | int | Grid width.
- height | int | Grid height.
- values | int[] | Backing flat array of size `width * height`.

## Constructors

- IntMap(int width, int height) | Creates a new grid and clears all values to -1.

## Methods

- index(int x, int y) | int | Converts 2D coordinates to a flat array index.
- validate(int index) | boolean | Returns true if the index is within bounds.
- clear() | void | Fills all values with -1.
- at(int x, int y) | int | Returns the value at the given 2D position.
- at(int index) | int | Returns the value at the given flat index.
- set(int x, int y, int value) | void | Sets the value at the given 2D position.
- set(int index, int value) | void | Sets the value at the given flat index.

Also in this package: DistanceTransform, DoubleMap, Node

Complete API:
  public int index(int x, int y)
  public boolean validate(int index)
  public void clear()
  public int at(int x, int y)
  public int at(int index)
  public void set(int x, int y, int value)
  public void set(int index, int value)

Fields:
public final int width
public final int height
private final int[] values
