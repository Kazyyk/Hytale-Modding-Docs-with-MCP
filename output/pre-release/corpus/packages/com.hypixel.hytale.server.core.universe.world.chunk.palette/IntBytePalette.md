# IntBytePalette

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.palette

public class IntBytePalette

## Fields

- public static final int LENGTH
- private short count
- private final Lock keysLock
- private final BitFieldArr array

## Constructors

- public IntBytePalette()
- public IntBytePalette(int aDefault)

## Methods

- public boolean set(int x, int z, int key)
- public int get(int x, int z)
- public short contains(int key)
- public void optimize()
- private void optimize(int index)
- public void serialize(@Nonnull ByteBuf dos)
- public void deserialize(@Nonnull ByteBuf dis)
- public byte[] serialize()
- public void copyFrom(@Nonnull IntBytePalette other)

Also in this package: BitFieldArr, ShortBytePalette

Complete API:
  public boolean set(int x, int z, int key)
  public int get(int x, int z)
  public short contains(int key)
  public void optimize()
  private void optimize(int index)
  public void serialize(ByteBuf dos)
  public void deserialize(ByteBuf dis)
  public byte[] serialize()
  public void copyFrom(IntBytePalette other)

Fields:
public static final int LENGTH
private short count
private final Lock keysLock
private int[] keys
private final BitFieldArr array
