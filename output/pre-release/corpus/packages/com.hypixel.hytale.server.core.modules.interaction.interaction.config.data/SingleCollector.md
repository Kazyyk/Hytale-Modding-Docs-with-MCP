# SingleCollector

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.data | Implements: Collector

public class SingleCollector<T> implements Collector

Implementation of `Collector`.

## Fields

- function | TriFunction<CollectorTag, InteractionContext, Interaction, T> | final TriFunction<CollectorTag, InteractionContext, Interaction, T> field.
- result | T | T field.

## Constructors

- SingleCollector(TriFunction<CollectorTag, InteractionContext, Interaction, T> function) | Creates a new SingleCollector instance.

## Methods

- getResult() | T | public method.
- start() | void | public method.
- into(@Nonnull InteractionContext context, Interaction interaction) | void | public method.
- collect(@Nonnull CollectorTag tag, @Nonnull InteractionContext context, @Nonnull Interaction interaction) | boolean | public method.
- outof() | void | public method.
- finished() | void | public method.
