# ModifyEvent

Type: interface | Package: com.hypixel.hytale.builtin.worldgen.modifier.event | Implements: IEvent<EventType>

public interface ModifyEvent<T> extends IEvent<EventType>

Interface for world-gen modification events. Carries the event type, file context, mutable entry list, and content loader.

## Methods


@Nonnull
    EventType type()


@Nonnull
    List<T> entries()

Known implementors: BiomeCovers, BiomeDynamicLayers, BiomeEnvironments, BiomeFluids, BiomePrefabs, BiomeStaticLayers, BiomeTints, CaveCovers, CavePrefabs, CaveTypes

Also in this package: BiomeCovers, BiomeDynamicLayers, BiomeEnvironments, BiomeFluids, BiomePrefabs, BiomeStaticLayers, BiomeTints, CaveCovers, CavePrefabs, CaveTypes, ContentLoader, EventType, ModifyEvents, SeedGenerator

Complete API:
  EventType type()
  FileContext<?> file()
  List<T> entries()
  ModifyEvent.ContentLoader<T> loader()
  static void dispatch(Class<E> type, E event)
