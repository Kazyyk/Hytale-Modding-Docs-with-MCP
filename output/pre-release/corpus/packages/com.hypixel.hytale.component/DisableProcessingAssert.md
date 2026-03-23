# DisableProcessingAssert

Type: interface | Package: com.hypixel.hytale.component

@Deprecated(forRemoval = true)
public interface DisableProcessingAssert

A deprecated marker interface. When a `RefSystem` implements this interface, the Store temporarily disables its write-processing assertion during entity add/remove callbacks for that system. This is a legacy escape hatch that allows certain systems to perform direct store mutations during callbacks. Scheduled for removal.

## Related Types

- Store -- checks for this interface during entity lifecycle callbacks

Known implementors: FixFillerBlocksSystem, LivingEntityEffectSystem, Ticking, Ticking, TickingSystem

Also in this package: AddReason, Archetype, ArchetypeChunk, CommandBuffer, Component, ComponentAccessor, ComponentRegistration, ComponentRegistry, ComponentRegistryProxy, ComponentType, Data, EmptyResourceStorage, Holder, IComponentRegistry, IResourceStorage, NonSerialized, NonTicking, ProcessingCounter, ReadWriteQuery, Ref (and 8 more)
