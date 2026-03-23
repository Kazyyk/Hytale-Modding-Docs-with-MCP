# EventHandler

Type: class | Package: com.hypixel.hytale.builtin.worldgen.modifier | Extends: java.lang.Object | Implements: AutoCloseable

public final class EventHandler implements AutoCloseable

Manages world-gen modification events. Collects WorldGenModifiers matching a given root, sorts by priority, and dispatches modify events to matching operations.

Also in this package: Modifier, PriorityEntry, Target, WorldGenModifier

Complete API:
  public EventHandler.Modifier[] get(EventType type)
  public void close()
  public static void handle(ModifyEvent<T> event)
  public static EventHandler acquire(Path root)

Fields:
private static final EventHandler EMPTY
private static final ThreadLocal<EventHandler> SCOPED_HANDLER
private static final ListPool<EventHandler.Modifier> POOL
private static final ListPool<EventHandler.PriorityEntry> ENTRY_POOL
private final EnumMap<EventType,EventHandler.Modifier[]> events
