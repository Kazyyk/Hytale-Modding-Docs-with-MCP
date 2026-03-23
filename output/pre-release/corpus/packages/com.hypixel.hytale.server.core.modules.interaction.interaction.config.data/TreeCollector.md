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

Also in this package: Collector, CollectorTag, ListCollector, Node, SingleCollector, StringTag

Complete API:
  public TreeCollector.Node<T> getRoot()
  public void start()
  public void into(InteractionContext context, Interaction interaction)
  public boolean collect(CollectorTag tag, InteractionContext context, Interaction interaction)
  public void outof()
  public void finished()

Fields:
private final TriFunction<CollectorTag,InteractionContext,Interaction,T> function
private TreeCollector.Node<T> root
private TreeCollector.Node<T> current
