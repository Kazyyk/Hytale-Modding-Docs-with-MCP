# ChunkPreLoadProcessEvent

Type: class | Package: com.hypixel.hytale.server.core.universe.world.events | Extends: ChunkEvent | Implements: IProcessedEvent

public class ChunkPreLoadProcessEvent extends ChunkEvent implements IProcessedEvent

## Fields

- private final boolean newlyGenerated
- private long lastDispatchNanos
- private boolean didLog
- private final Holder<ChunkStore> holder

## Methods

- public boolean isNewlyGenerated()
- public Holder<ChunkStore> getHolder()
- @Override public void processEvent(String hookName)
- public boolean didLog()
- @Nonnull @Override public String toString()

Also in this package: AddWorldEvent, AllWorldsLoadedEvent, ChunkEvent, RemovalReason, RemoveWorldEvent, StartWorldEvent, WorldEvent

Complete API:
  public boolean isNewlyGenerated()
  public Holder<ChunkStore> getHolder()
  public void processEvent(String hookName)
  public boolean didLog()
  public String toString()

Fields:
private final boolean newlyGenerated
private long lastDispatchNanos
private boolean didLog
private final Holder<ChunkStore> holder
