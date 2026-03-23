# EmptyBuilderModifier

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder | Extends: BuilderModifier

public class EmptyBuilderModifier extends BuilderModifier

A singleton null-object implementation of BuilderModifier. Used when a `"Modify"` block is absent or empty. `isEmpty()` returns `true`, `exportedStateCount()` returns `0`, and `applyComponentStateMap`/`popComponentStateMap` throw `UnsupportedOperationException`.

## Fields

- INSTANCE | EmptyBuilderModifier | The singleton instance.

## Related Types

- BuilderModifier -- parent class

Also in this package: Builder, BuilderAssetMonitorHandler, BuilderAttributeDescriptor, BuilderBase, BuilderBaseWithType, BuilderCodecObjectHelper, BuilderCombatConfig, BuilderComponent, BuilderContext, BuilderDescriptor, BuilderDescriptorState, BuilderFactory, BuilderInfo, BuilderManager, BuilderModifier, BuilderObjectArrayHelper, BuilderObjectHelper, BuilderObjectListHelper, BuilderObjectMapHelper, BuilderObjectReferenceHelper (and 28 more)

Complete API:
  public boolean isEmpty()
  public int exportedStateCount()
  public void applyComponentStateMap(BuilderSupport support)
  public void popComponentStateMap(BuilderSupport support)

Fields:
public static final EmptyBuilderModifier INSTANCE
