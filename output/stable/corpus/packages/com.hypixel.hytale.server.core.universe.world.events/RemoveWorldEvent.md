# RemoveWorldEvent

Type: class | Package: com.hypixel.hytale.server.core.universe.world.events | Extends: WorldEvent | Implements: ICancellable

public class RemoveWorldEvent extends WorldEvent implements ICancellable

## Fields

- private boolean cancelled
- private final RemoveWorldEvent.RemovalReason removalReason

## Methods

- @Nonnull public RemoveWorldEvent.RemovalReason getRemovalReason()
- @Override public boolean isCancelled()
- @Override public void setCancelled(boolean cancelled)
- @Nonnull @Override public String toString()

## Inner Types

- `RemoveWorldEvent.RemovalReason`

Also in this package: AddWorldEvent, AllWorldsLoadedEvent, ChunkEvent, ChunkPreLoadProcessEvent, RemovalReason, StartWorldEvent, WorldEvent

Complete API:
  public RemoveWorldEvent.RemovalReason getRemovalReason()
  public boolean isCancelled()
  public void setCancelled(boolean cancelled)
  public String toString()

Fields:
private boolean cancelled
private final RemoveWorldEvent.RemovalReason removalReason
