# TreeCollector

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.data | Implements: Collector

public class TreeCollector<T> implements Collector

Implementation of `Collector`.

## Fields

- function | TriFunction<CollectorTag, InteractionContext, Interaction, T> | final TriFunction<CollectorTag, InteractionContext, Interaction, T> field.
- root | TreeCollector.Node<T> | TreeCollector.Node<T> field.
- current | TreeCollector.Node<T> | TreeCollector.Node<T> field.

## Constructors

- TreeCollector(TriFunction<CollectorTag, InteractionContext, Interaction, T> function) | Creates a new TreeCollector instance.

## Methods

- getRoot() | TreeCollector.Node<T> | public method.
- start() | void | public method.
- into(@Nonnull InteractionContext context, Interaction interaction) | void | public method.
- collect(@Nonnull CollectorTag tag, @Nonnull InteractionContext context, @Nonnull Interaction interaction) | boolean | public method.
- outof() | void | public method.
- finished() | void | public method.
