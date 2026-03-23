# BuilderEntityFilterEntityEffect

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders | Extends: BuilderEntityFilterBase

public class BuilderEntityFilterEntityEffect extends BuilderEntityFilterBase

Builder for `EntityFilterEntityEffect`. Reads an `"EffectId"` field from the NPC configuration data, validated against the `EntityEffect` asset map. Produces an `EntityFilterEntityEffect` instance that checks for the presence of a specific entity effect on target entities.

## Fields

- entityEffect | AssetHolder | Holds the entity effect asset reference.

## Key Methods

- getShortDescription() | String | Returns `"Check whether an entity has a specific entity effect"`.
- getLongDescription() | String | Same as short description.
- build(BuilderSupport) | IEntityFilter | Creates a new `EntityFilterEntityEffect`.
- getBuilderDescriptorState() | BuilderDescriptorState | Returns `Stable`.
- readConfig(JsonElement) | Builder<IEntityFilter> | Reads the `"EffectId"` required asset field with validation.
- getEntityEffectIndex(BuilderSupport) | int | Resolves the entity effect string to its asset map index.
