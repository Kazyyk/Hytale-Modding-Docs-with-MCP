# BitFieldArr

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.palette

public class BitFieldArr

## Fields

- public static final int BITS_PER_INDEX
- public static final int LAST_BIT_INDEX
- public static final int INDEX_MASK
- private final int bits
- private final int length
- @Nonnull private final byte[] array

## Constructors

- public BitFieldArr(int bits, int length)

## Methods

- public int getLength()
- public int get(int index)
- public void set(int index, int value)
- private void setBit(int bitIndex, int bit)
- public byte[] get()
- public void set(@Nonnull byte[] bytes)
- @Nonnull public String toBitString()
- public void copyFrom(@Nonnull BitFieldArr other)

Also in this package: IntBytePalette, ShortBytePalette

Complete API:
  public int getLength()
  public int get(int index)
  public void set(int index, int value)
  private void setBit(int bitIndex, int bit)
  public byte[] get()
  public void set(byte[] bytes)
  public String toBitString()
  public void copyFrom(BitFieldArr other)

Fields:
public static final int BITS_PER_INDEX
public static final int LAST_BIT_INDEX
public static final int INDEX_MASK
private final int bits
private final int length
private final byte[] array
