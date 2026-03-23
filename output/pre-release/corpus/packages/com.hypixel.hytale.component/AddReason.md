# AddReason

Type: enum | Package: com.hypixel.hytale.component | Extends: java.lang.Enum

public enum AddReason

Indicates why an entity is being added to a Store. Passed to `RefSystem.onEntityAdded()` and `HolderSystem.onEntityAdd()` so systems can distinguish between newly created entities and entities restored from storage.

## Enum Constants

- SPAWN | The entity is newly created at runtime (e.g., NPC spawn, player join).
- LOAD | The entity is being restored from persistent storage (e.g., chunk load, stored flock restore).

## Related Types

- RemoveReason -- the corresponding enum for entity removal
- Store -- `addEntity()` accepts an `AddReason`
- CommandBuffer -- `addEntity()` accepts an `AddReason`

Also in this package: Archetype, ArchetypeChunk, CommandBuffer, Component, ComponentAccessor, ComponentRegistration, ComponentRegistry, ComponentRegistryProxy, ComponentType, Data, DisableProcessingAssert, EmptyResourceStorage, Holder, IComponentRegistry, IResourceStorage, NonSerialized, NonTicking, ProcessingCounter, ReadWriteQuery, Ref (and 8 more)
