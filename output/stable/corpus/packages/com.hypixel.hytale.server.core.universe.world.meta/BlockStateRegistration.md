# BlockStateRegistration

Type: class | Package: com.hypixel.hytale.server.core.universe.world.meta | Extends: Registration

public class BlockStateRegistration extends Registration

A registration handle for a block state class, extending the generic `Registration` base with a reference to the registered `BlockState` subclass. Provides lifecycle control (enabled check, unregister callback) for block state registrations managed by BlockStateModule.

## Constructors


public BlockStateRegistration(Class<? extends BlockState> blockStateClass, BooleanSupplier isEnabled, Runnable unregister)

Creates a new registration for the given block state class.


public BlockStateRegistration(@Nonnull BlockStateRegistration registration, BooleanSupplier isEnabled, Runnable unregister)

Copy constructor that wraps an existing registration with new lifecycle callbacks.

## Instance Methods


public Class<? extends BlockState> getBlockStateClass()

Returns the `BlockState` subclass this registration represents.
