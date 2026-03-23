# BitFieldArr

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.palette

public class BitFieldArr

Compact bit-packed array storing fixed-width integer values. Supports arbitrary bit widths per element, backed by a byte array. Provides `get(index)`, `set(index, value)`, bulk `get()`/`set()` for the backing array, `copyFrom()`, and `toBitString()` for debugging.

## Constants

- BITS_PER_INDEX | int | 8
- INDEX_MASK | int | 255

Also in this package: IntBytePalette, ShortBytePalette

Complete API:
  public int getLength()
  public int get(int index)
  public void set(int index, int value)
  public byte[] get()
  public void set(byte[] bytes)
  public String toBitString()
  public void copyFrom(BitFieldArr other)

Fields:
public static final int BITS_PER_INDEX
public static final int INDEX_MASK
private final int bits
private final int length
private final byte[] array
