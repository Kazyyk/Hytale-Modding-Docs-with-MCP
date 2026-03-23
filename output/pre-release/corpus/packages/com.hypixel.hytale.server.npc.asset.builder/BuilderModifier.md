# BuilderModifier

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder

public class BuilderModifier

Represents a `"Modify"` block in NPC JSON configuration that overrides parameters, exports state mappings, provides combat config overrides, and supplies interaction variables when referencing a component. The modifier creates a new expression scope that merges parameter overrides with the referenced builder's parameters.

## Constants

- KEY_MODIFY | String | "Modify"
- KEY_EXPORT_STATES | String | "_ExportStates"
- KEY_INTERFACE_PARAMETERS | String | "_InterfaceParameters"
- KEY_COMBAT_CONFIG | String | "_CombatConfig"
- KEY_INTERACTION_VARS | String | "_InteractionVars"

## Constructor


protected BuilderModifier(Object2ObjectMap<String, ExpressionHolder> builderExpressionMap, StatePair[] exportedStateIndexes, StateMappingHelper stateHelper, String combatConfig, Map<String, String> interactionVars)

## Methods

### getCombatConfig / getInteractionVars


public String getCombatConfig()
public Map<String, String> getInteractionVars()

### isEmpty


public boolean isEmpty()

Returns `true` if no parameter overrides are defined.

### exportedStateCount


public int exportedStateCount()

Returns the number of exported state pairs.

### applyComponentStateMap / popComponentStateMap


public void applyComponentStateMap(@Nonnull BuilderSupport support)
public void popComponentStateMap(@Nonnull BuilderSupport support)

Pushes and pops state mapping overrides on the BuilderSupport.

### createScope


@Nonnull
public Scope createScope(@Nonnull BuilderSupport builderSupport, @Nonnull BuilderParameters builderParameters, Scope globalScope)

Creates a merged expression scope containing parameter overrides.

### fromJSON (static)


@Nonnull
public static BuilderModifier fromJSON(@Nonnull JsonObject jsonObject, @Nonnull BuilderParameters builderParameters, @Nonnull StateMappingHelper helper, @Nonnull ExtraInfo extraInfo)

Parses a `"Modify"` JSON block. Returns EmptyBuilderModifier if the block is absent or empty.

### readModifierObject (static)


public static void readModifierObject(@Nonnull JsonObject jsonObject, @Nonnull BuilderParameters builderParameters, @Nonnull StringHolder holder, @Nonnull Consumer<StringHolder> referenceConsumer, @Nonnull Consumer<BuilderModifier> builderModifierConsumer, @Nonnull StateMappingHelper helper, @Nonnull ExtraInfo extraInfo)

Reads a JSON object containing both a `"Reference"` and a `"Modify"` block.

## Inner Types

### ExpressionHolder (private class)

Holds a default expression and optional interface-mapped expressions for parameter overrides.

### SchemaGenerator (private class)

Generates the JSON Schema for the modifier block.

## Related Types

- EmptyBuilderModifier -- singleton empty modifier
- BuilderObjectReferenceHelper -- uses modifiers when resolving references
- BuilderParameters -- the parameter scope being overridden
- StatePair -- exported state pairs
- StateMappingHelper -- state index management
