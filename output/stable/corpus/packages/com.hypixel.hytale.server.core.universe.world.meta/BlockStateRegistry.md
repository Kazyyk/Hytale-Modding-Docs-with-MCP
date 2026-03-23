# BlockStateRegistry

Type: class | Package: com.hypixel.hytale.server.core.universe.world.meta | Extends: Registry<BlockStateRegistration>

public class BlockStateRegistry extends Registry<BlockStateRegistration>

A registry facade for plugins to register block state types. Delegates to BlockStateModule for the actual ECS component registration, wrapping results in BlockStateRegistration handles with precondition checking.

## Constructors


public BlockStateRegistry(@Nonnull List<BooleanConsumer> registrations, BooleanSupplier precondition, String preconditionMessage)

## Instance Methods


@Nullable
public <T extends BlockState> BlockStateRegistration registerBlockState(@Nonnull Class<T> clazz, @Nonnull String key, Codec<T> codec)

Registers a block state class with a codec key. Checks preconditions before delegating to `BlockStateModule`.


@Nullable
public <T extends BlockState, D extends StateData> BlockStateRegistration registerBlockState(@Nonnull Class<T> clazz, @Nonnull String key, Codec<T> codec, Class<D> dataClass, Codec<D> dataCodec)

Registers a block state class along with its `StateData` class and codec.
