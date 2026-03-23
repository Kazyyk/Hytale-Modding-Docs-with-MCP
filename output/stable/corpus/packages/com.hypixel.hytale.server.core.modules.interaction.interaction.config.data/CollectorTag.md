# CollectorTag

Type: interface | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.data

public interface CollectorTag

Marker interface for tags used during interaction data collection. Tags identify the kind of data being collected at each node of the interaction tree. Provides a static `ROOT` sentinel instance.

## Fields

- ROOT | CollectorTag | Static sentinel tag representing the root of a collection tree.

Known implementors: ChainingTag, ChargingTag, MemoriesTag, ParallelTag, SerialTag, StringTag

Also in this package: Collector, ListCollector, Node, SingleCollector, StringTag, TreeCollector

Fields:
CollectorTag ROOT
