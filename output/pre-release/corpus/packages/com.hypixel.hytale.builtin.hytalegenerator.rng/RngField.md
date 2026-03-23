# RngField

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.rng | Extends: java.lang.Object

public class RngField

A seeded 2D/3D random field that produces deterministic integer values at any coordinate using `Rng.mix()`.

Also in this package: Rng, SeedBox

Complete API:
  public int get(int x, int y, int z)
  public int get(int x, int y)
  public int get(double x, double y, double z)
  public int get(double x, double y)

Fields:
private final int seed
