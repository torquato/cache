package br.com.tor4neto.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
//@ImportAutoConfiguration(classes = {
//		CacheAutoConfiguration.class,
//		RedisAutoConfiguration.class
//})
public class CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(CacheApplication.class, args);
    }


//	@Bean
//	public RedisCacheConfiguration cacheConfiguration() {
//		return RedisCacheConfiguration.defaultCacheConfig()
//				.entryTtl(Duration.ofMinutes(60))
//				.disableCachingNullValues()
//				.serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(new GenericJackson2JsonRedisSerializer()));
//	}

//	@Bean
//	public RedisCacheManagerBuilderCustomizer redisCacheManagerBuilderCustomizer() {
//		return (builder) -> builder
//				.withCacheConfiguration("itemCache",
//						RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofMinutes(10)))
//				.withCacheConfiguration("customerCache",
//						RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofMinutes(5)));
//	}
}
