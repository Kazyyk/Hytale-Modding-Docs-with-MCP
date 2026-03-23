# PrefabSetAnchorInteraction

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefabeditor | Extends: SimpleInstantInteraction

public class PrefabSetAnchorInteraction extends SimpleInstantInteraction

Interaction handler for setting a prefab's anchor point. On primary or secondary click, determines the targeted block position, finds the containing prefab, selects it, and moves the anchor entity to the target position. Reports errors if no target block, no containing prefab, or no active edit session is found.

## Methods

- firstRun(InteractionType, InteractionContext, CooldownHandler) | void | Sets the anchor of the prefab containing the target block.

## See Also

- PrefabSelectionInteraction
- PrefabEditingMetadata
