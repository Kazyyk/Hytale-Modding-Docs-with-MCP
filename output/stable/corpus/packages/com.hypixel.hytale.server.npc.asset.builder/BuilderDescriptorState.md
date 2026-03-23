# BuilderDescriptorState

Type: enum | Package: com.hypixel.hytale.server.npc.asset.builder

public enum BuilderDescriptorState

Defines the lifecycle state of a builder type or attribute. Used by BuilderDescriptor and BuilderAttributeDescriptor to communicate maturity and deprecation to tooling and documentation.

## Constants

- Unknown | State has not been classified.
- WorkInProgress | Under active development; may change without notice.
- Experimental | Available for testing but not guaranteed stable.
- Stable | Fully supported and expected to remain unchanged.
- Deprecated | Scheduled for removal. The Builder interface's `isDeprecated()` default method checks for this value.

## Related Types

- BuilderDescriptor -- uses this enum for builder-level state
- BuilderAttributeDescriptor -- uses this enum for attribute-level state
- Builder -- `isDeprecated()` checks against `Deprecated`

Also in this package: Builder, BuilderAssetMonitorHandler, BuilderAttributeDescriptor, BuilderBase, BuilderBaseWithType, BuilderCodecObjectHelper, BuilderCombatConfig, BuilderComponent, BuilderContext, BuilderDescriptor, BuilderFactory, BuilderInfo, BuilderManager, BuilderModifier, BuilderObjectArrayHelper, BuilderObjectHelper, BuilderObjectListHelper, BuilderObjectMapHelper, BuilderObjectReferenceHelper, BuilderObjectStaticHelper (and 28 more)
