# ShortBytePalette

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.palette

public class ShortBytePalette

## Fields

- public static final int LENGTH
- private short count
- private final Lock keysLock
- private final BitFieldArr array

## Constructors

- public ShortBytePalette()
- public ShortBytePalette(short aDefault)

## Methods

- public boolean set(int x, int z, short key)
- public short get(int x, int z)
- public short get(int index)
- public short contains(short key)
- public void optimize()
- private void optimize(int index)
- public void serialize(@Nonnull ByteBuf dos)
- public void deserialize(@Nonnull ByteBuf buf)
- public byte[] serialize()
- public void copyFrom(@Nonnull ShortBytePalette other)
