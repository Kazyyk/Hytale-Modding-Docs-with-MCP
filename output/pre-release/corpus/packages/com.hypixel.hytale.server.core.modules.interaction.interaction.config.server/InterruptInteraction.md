# InterruptInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction

public class InterruptInteraction extends SimpleInstantInteraction

Interrupts (cancels) active interaction chains on the target entity. Can optionally filter by interaction type, require a specific tag on the root interaction, or exclude chains with a specific tag.

## Codec Properties

- Entity | InteractionTarget | Yes (inherited) | USER | The entity to target for this interaction.
- InterruptTypes | Set<InteractionType> | No (inherited) | null | A set of interaction types to cancel. If `null`, all types are interrupted.
- RequiredTag | String | No (inherited) | null | Tag that the root interaction must have to be interrupted. If not set, no tag is required.
- ExcludedTag | String | No (inherited) | null | Tag that prevents an interaction chain from being interrupted.

## Fields

- InteractionTarget entityTarget
- Set<InteractionType> interruptTypes
- String requiredTag
- int requiredTagIndex
- String excludedTag
- int excludedTagIndex

## Methods


@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)

Retrieves the `InteractionManager` from the target entity, iterates all active chains, filters by type and tags, and calls `cancelChains` on matching chains.

## See Also

- `InteractionManager` -- manages active interaction chains on entities
- `InteractionChain` -- represents an active chain of interactions
