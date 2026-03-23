# SeedBox

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.rng | Extends: java.lang.Object

public class SeedBox

A hierarchical seed container for world generation. Creates child seed boxes and supplies deterministic integer seeds.

Also in this package: Rng, RngField

Complete API:
  public SeedBox child(String childKey)
  public Supplier<Integer> createSupplier()
  public String toString()

Fields:
private final String key
