# NonSerialized

Type: class | Package: com.hypixel.hytale.component | Extends: java.lang.Object | Implements: Component<ECS_TYPE>

public class NonSerialized<ECS_TYPE> implements Component<ECS_TYPE>

A marker component that prevents an entity from being serialized. When present in an entity's archetype, the entity is excluded from persistence operations (`hasSerializableComponents()` returns `false`, `getSerializableArchetype()` returns empty). The component is a singleton.

## Methods


public static <ECS_TYPE> NonSerialized<ECS_TYPE> get()

Returns the singleton instance.

## Related Types

- NonTicking -- the equivalent marker for disabling tick processing
- Archetype -- checks for NonSerialized in `hasSerializableComponents()`
