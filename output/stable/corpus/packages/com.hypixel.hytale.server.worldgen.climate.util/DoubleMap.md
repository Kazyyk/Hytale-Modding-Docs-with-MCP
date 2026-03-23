# DoubleMap

Type: class | Package: com.hypixel.hytale.server.worldgen.climate.util

public class DoubleMap

Fixed-size 2D grid of `double` values backed by a flat array. Used by the climate system for storing continuous-valued spatial data such as temperature or moisture. Values default to -1.0 when cleared.

## Fields

- width | int | Grid width.
- height | int | Grid height.
- values | double[] | Backing flat array of size `width * height`.

## Constructors

- DoubleMap(int width, int height) | Creates a new grid and clears all values to -1.0.

## Methods

- index(int x, int y) | int | Converts 2D coordinates to a flat array index.
- validate(int index) | boolean | Returns true if the index is within bounds.
- clear() | void | Fills all values with -1.0.
- at(int x, int y) | double | Returns the value at the given 2D position.
- at(int index) | double | Returns the value at the given flat index.
- set(int x, int y, double value) | void | Sets the value at the given 2D position.
- set(int index, double value) | void | Sets the value at the given flat index.
