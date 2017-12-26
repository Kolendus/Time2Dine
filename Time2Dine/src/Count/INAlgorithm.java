public interface INAlgorithm {
    void mutate(Chromosome [] chromosomes);
    void crossBreed(Chromosome [] chromosomes);
    Chromosome generateChromosomes(Canteen canteen);
}
