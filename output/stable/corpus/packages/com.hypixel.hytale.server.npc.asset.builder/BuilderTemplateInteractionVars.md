# BuilderTemplateInteractionVars

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder | Extends: BuilderCodecObjectHelper<Map<String, String>>

public class BuilderTemplateInteractionVars extends BuilderCodecObjectHelper<Map<String, String>>

A codec object helper specialized for reading template interaction variable maps. Uses the `RootInteraction.CHILD_ASSET_CODEC_MAP` codec to decode a map of string-to-string interaction variables from JSON. Supports runtime override via `ExecutionContext.getInteractionVars()`.

## Constructor


public BuilderTemplateInteractionVars()

Initializes with `RootInteraction.class` and `RootInteraction.CHILD_ASSET_CODEC_MAP`.

## Methods

### build


public Map<String, String> build()

Throws `UnsupportedOperationException`. Use `build(ExecutionContext)` instead.


@Nullable
public Map<String, String> build(@Nonnull ExecutionContext context)

Returns the interaction vars map. If the execution context provides an override, that value is used.

## Related Types

- BuilderCodecObjectHelper -- parent class
- BuilderModifier -- can provide `_InteractionVars` overrides

Also in this package: Builder, BuilderAssetMonitorHandler, BuilderAttributeDescriptor, BuilderBase, BuilderBaseWithType, BuilderCodecObjectHelper, BuilderCombatConfig, BuilderComponent, BuilderContext, BuilderDescriptor, BuilderDescriptorState, BuilderFactory, BuilderInfo, BuilderManager, BuilderModifier, BuilderObjectArrayHelper, BuilderObjectHelper, BuilderObjectListHelper, BuilderObjectMapHelper, BuilderObjectReferenceHelper (and 28 more)

Complete API:
  public Map<String,String> build()
  public void readConfig(JsonElement data, ExtraInfo extraInfo)
  public Map<String,String> build(ExecutionContext context)
