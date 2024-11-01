package br.com.fiap.projetos_api.service.mapper;

import br.com.fiap.projetos_api.dto.ClaimDTO;
import br.com.fiap.projetos_api.dto.ClientDTO;
import br.com.fiap.projetos_api.dto.CoverageDTO;
import br.com.fiap.projetos_api.dto.InsuranceContractDTO;
import br.com.fiap.projetos_api.model.Claim;
import br.com.fiap.projetos_api.model.Client;
import br.com.fiap.projetos_api.model.Coverage;
import br.com.fiap.projetos_api.model.InsuranceContract;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-01T08:36:43-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.2.1 (Oracle Corporation)"
)
@Component
public class InsuranceContractMapperImpl implements InsuranceContractMapper {

    @Override
    public InsuranceContractDTO toDTO(InsuranceContract contract) {
        if ( contract == null ) {
            return null;
        }

        InsuranceContractDTO insuranceContractDTO = new InsuranceContractDTO();

        insuranceContractDTO.setId( contract.getId() );
        insuranceContractDTO.setInsuranceObject( contract.getInsuranceObject() );
        insuranceContractDTO.setSignTimeStamp( contract.getSignTimeStamp() );
        insuranceContractDTO.setEndCoverageTimeStamp( contract.getEndCoverageTimeStamp() );
        insuranceContractDTO.setCoverageList( coverageListToCoverageDTOList( contract.getCoverageList() ) );
        insuranceContractDTO.setClaimList( claimListToClaimDTOList( contract.getClaimList() ) );
        insuranceContractDTO.setClient( clientToClientDTO( contract.getClient() ) );

        return insuranceContractDTO;
    }

    @Override
    public InsuranceContract toEntity(InsuranceContractDTO contractDTO) {
        if ( contractDTO == null ) {
            return null;
        }

        InsuranceContract insuranceContract = new InsuranceContract();

        insuranceContract.setId( contractDTO.getId() );
        insuranceContract.setInsuranceObject( contractDTO.getInsuranceObject() );
        insuranceContract.setSignTimeStamp( contractDTO.getSignTimeStamp() );
        insuranceContract.setEndCoverageTimeStamp( contractDTO.getEndCoverageTimeStamp() );
        insuranceContract.setCoverageList( coverageDTOListToCoverageList( contractDTO.getCoverageList() ) );
        insuranceContract.setClaimList( claimDTOListToClaimList( contractDTO.getClaimList() ) );
        insuranceContract.setClient( clientDTOToClient( contractDTO.getClient() ) );

        return insuranceContract;
    }

    protected CoverageDTO coverageToCoverageDTO(Coverage coverage) {
        if ( coverage == null ) {
            return null;
        }

        CoverageDTO coverageDTO = new CoverageDTO();

        coverageDTO.setId( coverage.getId() );
        coverageDTO.setDescription( coverage.getDescription() );
        coverageDTO.setAmount( coverage.getAmount() );

        return coverageDTO;
    }

    protected List<CoverageDTO> coverageListToCoverageDTOList(List<Coverage> list) {
        if ( list == null ) {
            return null;
        }

        List<CoverageDTO> list1 = new ArrayList<CoverageDTO>( list.size() );
        for ( Coverage coverage : list ) {
            list1.add( coverageToCoverageDTO( coverage ) );
        }

        return list1;
    }

    protected ClaimDTO claimToClaimDTO(Claim claim) {
        if ( claim == null ) {
            return null;
        }

        ClaimDTO claimDTO = new ClaimDTO();

        claimDTO.setId( claim.getId() );
        claimDTO.setClaimDate( claim.getClaimDate() );
        claimDTO.setClaimText( claim.getClaimText() );
        claimDTO.setStatus( claim.getStatus() );

        return claimDTO;
    }

    protected List<ClaimDTO> claimListToClaimDTOList(List<Claim> list) {
        if ( list == null ) {
            return null;
        }

        List<ClaimDTO> list1 = new ArrayList<ClaimDTO>( list.size() );
        for ( Claim claim : list ) {
            list1.add( claimToClaimDTO( claim ) );
        }

        return list1;
    }

    protected ClientDTO clientToClientDTO(Client client) {
        if ( client == null ) {
            return null;
        }

        ClientDTO clientDTO = new ClientDTO();

        clientDTO.setId( client.getId() );
        clientDTO.setName( client.getName() );

        return clientDTO;
    }

    protected Coverage coverageDTOToCoverage(CoverageDTO coverageDTO) {
        if ( coverageDTO == null ) {
            return null;
        }

        Coverage coverage = new Coverage();

        coverage.setId( coverageDTO.getId() );
        coverage.setDescription( coverageDTO.getDescription() );
        coverage.setAmount( coverageDTO.getAmount() );

        return coverage;
    }

    protected List<Coverage> coverageDTOListToCoverageList(List<CoverageDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Coverage> list1 = new ArrayList<Coverage>( list.size() );
        for ( CoverageDTO coverageDTO : list ) {
            list1.add( coverageDTOToCoverage( coverageDTO ) );
        }

        return list1;
    }

    protected Claim claimDTOToClaim(ClaimDTO claimDTO) {
        if ( claimDTO == null ) {
            return null;
        }

        Claim claim = new Claim();

        claim.setId( claimDTO.getId() );
        claim.setClaimDate( claimDTO.getClaimDate() );
        claim.setClaimText( claimDTO.getClaimText() );
        claim.setStatus( claimDTO.getStatus() );

        return claim;
    }

    protected List<Claim> claimDTOListToClaimList(List<ClaimDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Claim> list1 = new ArrayList<Claim>( list.size() );
        for ( ClaimDTO claimDTO : list ) {
            list1.add( claimDTOToClaim( claimDTO ) );
        }

        return list1;
    }

    protected Client clientDTOToClient(ClientDTO clientDTO) {
        if ( clientDTO == null ) {
            return null;
        }

        Client client = new Client();

        client.setId( clientDTO.getId() );
        client.setName( clientDTO.getName() );

        return client;
    }
}
