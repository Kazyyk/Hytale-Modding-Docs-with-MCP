# ModifyEvent

Type: interface | Package: com.hypixel.hytale.builtin.worldgen.modifier.event | Implements: IEvent<EventType>

public interface ModifyEvent<T> extends IEvent<EventType>

Interface for world-gen modification events. Carries the event type, file context, mutable entry list, and content loader.

## Methods


@Nonnull
    EventType type()


@Nonnull
    List<T> entries()
