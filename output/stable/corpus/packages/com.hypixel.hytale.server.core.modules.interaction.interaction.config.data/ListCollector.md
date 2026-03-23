# ListCollector

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.data | Implements: Collector

public class ListCollector<T> implements Collector

Implementation of `Collector`.

## Fields

- function | TriFunction<CollectorTag, InteractionContext, Interaction, T> | final TriFunction<CollectorTag, InteractionContext, Interaction, T> field.
- list | List<T> | List<T> field.

## Constructors

- ListCollector(TriFunction<CollectorTag, InteractionContext, Interaction, T> function) | Creates a new ListCollector instance.

## Methods

- getList() | List<T> | public method.
- start() | void | public method.
- into(@Nonnull InteractionContext context, Interaction interaction) | void | public method.
- collect(@Nonnull CollectorTag tag, @Nonnull InteractionContext context, @Nonnull Interaction interaction) | boolean | public method.
- outof() | void | public method.
- finished() | void | public method.

Also in this package: Collector, CollectorTag, Node, SingleCollector, StringTag, TreeCollector

Complete API:
  public List<T> getList()
  public void start()
  public void into(InteractionContext context, Interaction interaction)
  public boolean collect(CollectorTag tag, InteractionContext context, Interaction interaction)
  public void outof()
  public void finished()

Fields:
private final TriFunction<CollectorTag,InteractionContext,Interaction,T> function
private List<T> list
