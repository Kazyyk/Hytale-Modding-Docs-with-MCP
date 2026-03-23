# EnvironmentColumn

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.environment

public class EnvironmentColumn

## Constants

- public static final int MIN
- public static final int MAX

## Fields

- public static final int MIN
- public static final int MAX
- private IntArrayList maxYs
- private IntArrayList values

## Methods

- public EnvironmentColumn(@Nonnull int[] maxYs, @Nonnull int[] values)
- public EnvironmentColumn(@Nonnull IntArrayList maxYs, @Nonnull IntArrayList values)
- public EnvironmentColumn(int initialId)
- public int size()
- public int getValue(int index)
- public int getValueMin(int index)
- public int getValueMax(int index)
- public int indexOf(int y)
- public void set(int value)
- public int get(int y)
- public void set(int y, int value)
- public int getMin(int y)
- public int getMax(int y)
- public void set(int fromY, int toY, int value)
- public void resetTo(@Nonnull int[] maxYs, @Nonnull int[] values)
- public void serialize(@Nonnull ByteBuf buf, @Nonnull IntObjectConsumer<ByteBuf> valueSerializer)
- public void serializeProtocol(@Nonnull ByteBuf buf)
- public void deserialize(@Nonnull ByteBuf buf, @Nonnull ToIntFunction<ByteBuf> valueDeserializer)
- public void copyFrom(@Nonnull EnvironmentColumn other)
- public void trim()
- public boolean equals(@Nullable Object o)
- public int hashCode()
- public String toString()
