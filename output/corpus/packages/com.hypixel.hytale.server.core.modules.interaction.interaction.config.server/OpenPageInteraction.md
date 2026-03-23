# OpenPageInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction

public class OpenPageInteraction extends SimpleInstantInteraction

Opens a predefined page for the player. Supports optional usage validators registered per-page and a flag controlling whether the page can be closed through another interaction.

## Codec Properties

- Page | Page` enum | Yes (inherited) | -- | The predefined page to open.
- CanCloseThroughInteraction | boolean | No (inherited) | false | Whether this page can be closed by a subsequent interaction.

## Fields

- Page page
- boolean canCloseThroughInteraction

## Static Methods


public static void registerUsageValidator(Page page, OpenPageInteraction.PageUsageValidator validator)

Registers a validator that gates whether a specific page can be opened. The validator is checked before opening.

## Methods


@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)

Gets the player component, checks the usage validator (if registered), and calls `PageManager.setPage`.

## Inner Interfaces

- PageUsageValidator -- functional interface for gating page access

## See Also

- `PageManager` -- manages page state for the player
