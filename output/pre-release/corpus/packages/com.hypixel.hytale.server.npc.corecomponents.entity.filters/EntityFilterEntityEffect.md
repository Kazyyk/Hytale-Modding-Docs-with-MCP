# EntityFilterEntityEffect

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters | Extends: EntityFilterBase

public class EntityFilterEntityEffect extends EntityFilterBase

NPC entity filter that checks whether a target entity has a specific active entity effect. Used in NPC AI decision-making to conditionally include or exclude entities based on applied effects (e.g., poison, buffs).

## Static Fields

- COST | int | Filter evaluation cost: `100`.

## Constructor


public EntityFilterEntityEffect(@Nonnull BuilderEntityFilterEntityEffect builder, @Nonnull BuilderSupport support)

Resolves the entity effect index from the builder at construction time.

## Methods

- matchesEntity(Ref<EntityStore>, Ref<EntityStore>, Role, Store<EntityStore>) | boolean | Returns `true` if the target entity's `EffectControllerComponent` has the specified effect active.
- cost() | int | Returns `100`.
