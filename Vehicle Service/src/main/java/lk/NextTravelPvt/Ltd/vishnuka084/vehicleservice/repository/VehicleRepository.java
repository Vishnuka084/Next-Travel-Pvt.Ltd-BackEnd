package lk.NextTravelPvt.Ltd.vishnuka084.vehicleservice.repository;

import lk.NextTravelPvt.Ltd.vishnuka084.vehicleservice.entity.Vehicle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * Created by Vishnuka Yahan
 *
 * @author  : Vishnuka Yahan
 * @data    : 11/1/2023
 * @project : Next TravelPvt. Ltd
 *
 */
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,String> {

//    List<Vehicle> findAllByVehicleTransmissionTypeOrderByVehicleTransmissionTypeAsc(String type);

    List<Vehicle> findByOrderByVehicleSeatCapacityDesc();

    List<Vehicle> findByVehicleTransmissionTypeOrderByVehicleSeatCapacityDesc(String transmissionType);

    List<Vehicle> findByVehicleTransmissionTypeOrderByVehicleIdAsc(String transmissionType);

    Page<Vehicle> findByVehicleFuelTypeIsLike(String fuelType, Pageable pageable);

    List<Vehicle> findByVehicleTransmissionTypeIsLike(String transmissionType, Pageable pageable);

    List<Vehicle> findByVehicleSearchTypeIsLike(String searchType,Pageable pageable);

    List<Vehicle> findByVehicleFuelTypeAndVehicleTransmissionTypeOrderByVehicleBrand(
            String fuelType,String transmissionType);
}